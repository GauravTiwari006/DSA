// 5. Using 2 stacks implement a queue.



import java.util.*;
class queueUsingStack
{
    Stack<Integer> s ;
    Stack<Integer> tmp ;
 
    /* Constructor */

    public queueUsingStack()
    {
        s = new Stack<Integer>();
        tmp = new Stack<Integer>();
    }


    public void insert(int data)
    {
               
        if (s.size() == 0)
            s.push(data);
        else
        {   
                    
            int l = s.size();
            for (int i = 0; i < l; i++)
                tmp.push(s.pop());                   
                       
            s.push(data);            
                     
            for (int i = 0; i < l; i++)
                s.push(tmp.pop());                   
        }
    }    
    /*  Function to remove front element from the queue */
    public int remove()
    {
        if (s.size() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return s.pop();
    }    
    /*  Function to check the front element of the queue */
    public int peek()
    {
        if (s.size() == 0)
            throw new NoSuchElementException("Underflow Exception");            
        return s.peek();
    }        
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return s.size() == 0 ;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return s.size();
    }    
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        int l = getSize();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            /* Iterator wont return for stack in order */            
            for (int i = l - 1; i >= 0; i--)
                System.out.print(s.get(i)+" ");                
            System.out.println();
        }
    }
}
 
