package Memento;

public class Client {

    public static void main(String[] args) {

        /**
         * Create a empOriginator
         */
        EmpCareTaker empCareTaker = new EmpCareTaker();
        EmpOriginator empOriginator = new EmpOriginator(12,"Anais Jegu","35355335","rider");
        empCareTaker.addMemento(empOriginator.saveToMemento());
        System.out.println(empOriginator.toString());

        empOriginator.setEmpPhoneNo("xxxxxxxxxxxxxxxxxx");
        System.out.println(empOriginator.toString());


        EmpMemento empMemento = empCareTaker.getMemento();
        empOriginator.undoFromMemento(empMemento);

        System.out.println(empOriginator.toString());




    }



}
