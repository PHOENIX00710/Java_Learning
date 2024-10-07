enum Status{
    Running,Waiting,Failed,Abort
}

public class Enum {
    public static void main(String[] args) {
        Status[] st=Status.values();
        for(Status it:st){
            switch (it){
                case Running:
                    System.out.println("The process in Running");
                    break;
                case Waiting:
                    System.out.println("The process in waiting");
                    break;
                case Failed:
                    System.out.println("The process failed to execute");
                    break;
                case Abort:
                    System.out.println("The process aborted abruptly");
                    break;
            }
        }
    }
}
