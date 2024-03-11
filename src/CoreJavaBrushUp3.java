public class CoreJavaBrushUp3 {



public static void main(String[] args) {

// TODO Auto-generated method stub



//string is an object //String literal



// String s1 = "Rahul Shetty Academy";

String s5 = "hello";

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

MethodsDemo d = new MethodsDemo();

String name = d.getData();

System.out.println(name);
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//new

String s2 = new String("Welcome");

String s3 = new String("Welcome");



String s = "Rahul Shetty Academy";

String[] splittedString = s.split(" ");

System.out.println(splittedString[0]);

System.out.println(splittedString[1]);

System.out.println(splittedString[2].trim());

System.out.println("***************************************");

for(int i =s.length()-1;i>=0;i--)

{

System.out.println(s.charAt(i));

}

}



}
