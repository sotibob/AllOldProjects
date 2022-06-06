class Main {

    public static void main(String[] args){
    Duck d = new Duck();
    System.out.println(d.sound());
    System.out.println(d.name());
  }
  
}
// 1. Create a Duck class in a new file that utilizes our Bird Interface.
// 2. Give functionality to our sound and name methods. The sound method should return "Quack!" and the name method should return "Duck". (Remember: That the return type of the methods must match the return type of the abstract method you are overriding.)