package ch.jemili.yasmina.myheroapp;

/**
 * Created by Yasmina on 11.03.18.
 */

public class Api {
    private static final String ROOT_URL = "http://192.168.64.2/HeroApi/v1/Api.php?apicall=createhero";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";
}
