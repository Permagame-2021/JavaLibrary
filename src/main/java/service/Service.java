package service;

import action.Action;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import plantTypes.PlantType;
import state.game.Game;
import state.game.PlantFamilies;
import state.game.PlayerAction;

import java.io.IOException;

public class Service {
    protected String token = "Your Token Here";
    protected String uri = "https://permagame.app.norsys.io/api/";

    protected CloseableHttpClient httpClient;

    protected HttpGet get;
    protected HttpPost post;

    protected CloseableHttpResponse response;
    protected StringEntity postingString;
    protected final ObjectMapper mapper;

    private static Service instance;

    private Service() {
        this.httpClient = HttpClientBuilder.create().build();
        this.mapper= new ObjectMapper();
        this.mapper.enableDefaultTyping();
    }

    public static Service getInstance() {
        if(Service.instance == null) {
            Service.instance = new Service();
        }
        return Service.instance;
    }

    public Object doGET(String route) {
        this.get = new HttpGet(this.uri + route);

        try {
            this.response = this.httpClient.execute(get);
            switch (route) {
                case "/state" :
                    return this.mapper.readValue((this.response.getEntity().getContent()), Game.class);
                case "/plants" :
                    return this.mapper.readValue((this.response.getEntity().getContent()), PlantType[].class);
                case "/plantFamilies" :
                    return this.mapper.readValue((this.response.getEntity().getContent()), PlantFamilies.class);
                case "/actionList" :
                    return this.mapper.readValue((this.response.getEntity().getContent()), PlayerAction[].class);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            this.get.reset();
        }
        return null;
    }

    public void doPOST(Action action) throws IOException {
        preparePOST(action);
        executePOST();
    }

    private void preparePOST(Action action) throws IOException {
        this.post = new HttpPost(this.uri + "/action");
        this.post.setHeader("Content-type", "application/json");
        this.post.setHeader("Authorization", ("Bearer " + this.token));

        this.postingString = new StringEntity(this.mapper.writeValueAsString(action));
        this.post.setEntity(this.postingString);
    }

    private void executePOST() {
        try {
            this.response = this.httpClient.execute(this.post);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            this.post.reset();
        }
    }
}
