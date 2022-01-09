
// 6. Using 2 queue implement a stack."

public class QueueImplementUsingTwoStacks
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);    
        /* Creating object of class queueUsingStack */
        queueUsingStack qus = new queueUsingStack();            
        /* Perform Queue Operations */            
        System.out.println("Queue Using Two Stacks Test\n"); 
        char ch;         
        do
        {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                qus.insert( scan.nextInt() );                 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Removed Element = "+ qus.remove() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ qus.peek() );
                }
                catch (Exception e) 
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                          
            case 4 : 
                System.out.println("Empty status = "+ qus.isEmpty() );
                break;                
            case 5 : 
                System.out.println("Size = "+ qus.getSize() );
                break;                          
            default : 
                System.out.println("Wrong Entry \n ");
                break;    
            }                
            /* Display Queue */        
            qus.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                                                            
    } 
}
