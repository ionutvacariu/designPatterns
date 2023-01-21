package spring;

public class Main {

    public static void main(String[] args) {
        Context instance = Context.getInstance();
        instance.populateContext();


        ComponentWithAutowired fromContext = instance.getProxyFromContext(ComponentWithAutowired.class.getSimpleName(), ComponentWithAutowired.class);
        fromContext.aiciApelamMyBean();

        ComponentWithAutowired notFromContext = new ComponentWithAutowired();
        try {
            notFromContext.aiciApelamMyBean();
        }catch (NullPointerException e){
            System.out.println("Aici va da NPE, deoarece nu il luam din context, deci field-ul autowired nu va fi populat");
        }

    }
}
