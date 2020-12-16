package Lesson4;

public class Lesson41 {
    public static void main(String[] args){
        Personal one = new Personal("Vladimir", "database administrator", "89118883344", 5500, 35);
        Personal two = new Personal("Anna", "developer", "89218883344", 7500, 25);
        one.inPersonalAll();
        System.out.println(one.getName() + " " + one.getStatus());



        Personal[] myPersonal = {
                    new Personal("Victor", "admin", "89211112222",
                            5599, 39),
                    new Personal("Maria", "admin", "89212223333",
                            5498, 41),
                    new Personal("Liza", "admin", "89213334444",
                            6000, 49),
                    new Personal("Olga", "manager", "89214445555",
                            7999, 34),
                    new Personal("Alex", "developer", "89215556666",
                            8999, 44)
            };
        for(int i = 0; i < myPersonal.length; i++){
            if (myPersonal[i].getAge() > 40){
                System.out.println(myPersonal[i].inPersonalAll());
            }
        }




        }

    }

