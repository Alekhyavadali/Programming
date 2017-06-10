package queue;

class me{
	int front=0;
		int [] m=new int[5];
	int rear=-1;
	void enqueue(int x){
		rear=rear+1;
		m[rear]=x;
		
	}
	int dequeue(){
	front=front+1;;	
	return m[front];
	}
}
public class queue {

	public static void main(String[] args) {
		me k=new me();
		k.enqueue(5);
		k.enqueue(7);
		k.enqueue(9);
		k.dequeue();
		for(int i=k.front;i<=k.rear;i++){
			System.out.print(k.m[i]);
			}

	}

}
