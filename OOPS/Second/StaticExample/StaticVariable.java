package Second.StaticExample;

public class StaticVariable {
    public static void main(String[] args) {
        Human Ram = new Human(22, "Ram", 45000, false);
        Human Shyam = new Human(26, "Shyam", 40000, true);
        Human Mayank = new Human(21, "Mayank", 50000, false);

        System.out.println(Ram.population);
        System.out.println(Shyam.population);
        System.out.println(Mayank.population);
        System.out.println(Human.population);
    }

    static class Human {
        int age;
        String name;
        float salary;
        boolean married;
        static long population;

        public Human(int age, String name, float salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population = 20;
        }
    }
}