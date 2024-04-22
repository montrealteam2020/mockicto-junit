package com.mockito.unittesting.object;

public class MainEquals {

    public static void main(String[] args) {

        Person p1 = new Person("toto", "tata", "x42") ;
        Person p2 = new Person("toto", "tata", "x42") ;

        System.out.println("Test avec '==' p1 X p2: " + (p1 == p2));
        System.out.println("Test avec 'equals' p1 X p1 : " + p1.equals(p1));
        System.out.println("Test avec 'equals' p1 X p2 : " + p1.equals(p2));
        System.out.println("Test avec 'equals' p2 X p1 : " + p2.equals(p1));

        System.out.println("Test avec p1.hashCode : " + p1.hashCode() );
        System.out.println("Test avec p2.hashCode : " + p2.hashCode() );
       // System.out.println("Test avec p2.hashCode : " + 2 >> 1  ?);


    }
}
