/*
package offer1_stack;


import java.util.Stack;


*/
/**
 * 用两个栈实现一个队列
 *
 * @author 徐浩然
 * @version Queue, 2017-10-16
 *//*

public class Queue<T>
{

    */
/**
     * 当前队列大小
     *//*

    private int queSize;
    */
/**
     * 队列最大容量
     *//*

    private int maxSize;
    */
/**
     * 两个栈
     *//*

    private Stack<T> stack1;
    private Stack<T> stack2;

    */
/**
     * 初始化队列
     *
     * @param maxSize 设置最大容量
     **//*

    public Queue(int maxSize)
    {
        if (maxSize <= 0)
        {
            System.out.println("队列大小不能小于1");
            return;
        }
        //初始化栈
        stack1 = new Stack<T>();
        stack2 = new Stack<T>();
    }

    */
/**
     * 入队
     *
     * @param obj 入队的元素
     *//*

    public boolean push(T obj)
    {
        if (obj == null)
        {
            System.out.println("入队元素不能为空");
            return false;
        }
        if (stack1.size() >= maxSize)
        {
            System.out.println("队列已经满");
            return false;
        }

        //入队
        stack1.push(obj);
        queSize++;
        return true;
    }

    */
/**
     * 出队
     *//*

    public T pop()
    {
        //队空
        if (queSize == 0)
        {
            System.out.println("空队列");
            return null;
        }

        //反转元素，同步到stack2中
        while (stack1.size() > 0)
        {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    */
/**
     * 打印队列
     *//*

    @Override
    public String toString(){
        System.out.println("Queue---maxSize:"+maxSize+"---queSize:"+queSize+"------");
        //队列是空的
        if (queSize == 0)
        {
            System.out.println("队列为空");
            return null;
        }

        //如果数据都在stack1中就转到stack2中
        if (stack1.size()>=0){
            while (stack1.size()>0){
                stack2.push(stack1.pop());
            }
        }

        //打印
        for(int i=0;i<stack2.size();i++){
            System.out.println(stack2.top());
        }
        System.out.println("Queue--------------------------------------------------");
        return null;
    }


}
*/
