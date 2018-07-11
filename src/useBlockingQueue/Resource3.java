package useBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Resource3 {

	private BlockingQueue<Integer> resourceQueue = new LinkedBlockingQueue<Integer>(10);
	/**
	* ����Դ���������Դ
	*/
	public void add(){
		try {
			resourceQueue.put(1);
			System.out.println("������" + Thread.currentThread().getName()
					+ "����һ����Դ," + "��ǰ��Դ����" + resourceQueue.size() + 
					"����Դ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����Դ�����Ƴ���Դ
	 */
	public void remove(){
		try {
			resourceQueue.take();
			System.out.println("������" + Thread.currentThread().getName() + 
					"����һ����Դ," + "��ǰ��Դ����" + resourceQueue.size() 
					+ "����Դ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
