package useSynchronized;

public class Resource {
	//��ǰ��Դ����
	private int num = 0;
	//��Դ���������ŵ���Դ��Ŀ
	private int size = 10;
	
	/*
	 * ����Դ����ȡ����Դ
	 */
	public synchronized void remove() {
		if(num > 0) {
			num--;
			System.out.println("������" + Thread.currentThread().getName() +"����һ����Դ��" + "��ǰ�̳߳���" + num + "��");
			notifyAll();//֪ͨ������������Դ
		} else {
			try {
				//���û����Դ���������߽���ȴ�״̬
				wait();
				System.out.println("������" + Thread.currentThread().getName() + "�߳̽���ȴ�״̬");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * ����Դ���������Դ
	 */
	public synchronized void add() {
		if(num < size) {
			num++;
			System.out.println(Thread.currentThread().getName() + "����һ����Դ����ǰ��Դ����"+num+"��");
			//֪ͨ�ȴ���������
			notifyAll();
		} else {
			//�����ǰ��Դ������10����Դ
			try {
				wait();//�����߽���ȴ�״̬�����ͷ���
				System.out.println(Thread.currentThread().getName()+"�߳̽���ȴ�");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
