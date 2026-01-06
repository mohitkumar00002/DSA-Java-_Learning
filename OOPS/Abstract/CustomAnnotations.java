package Abstract;

@interface MyAnnotation {
    String value();
}

public class CustomAnnotations {
    @MyAnnotation(value = "Hello Annotation")
    public static void main(String[] args) {
        System.out.println("Running Test Class");
    }
}
