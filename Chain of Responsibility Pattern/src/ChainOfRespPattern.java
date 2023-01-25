public class ChainOfRespPattern {
    public static void main(String[] args){
        Application app = new Application();
        Middleware middleware = new Middleware(app);
        Frontend frontend = new Frontend(middleware);

        final int FRONTEND_HELP = 1;
        final int MIDDLEWARE_HELP = 2;
        final int APPLICATION_HELP = 3;

        /* This notification will be handled by the middleware, and will not be propagated to the application. */
        frontend.getHelp(MIDDLEWARE_HELP);
        /* This notification will be propagated to the application, where it will be handled. */
        frontend.getHelp(APPLICATION_HELP);
    }
}
