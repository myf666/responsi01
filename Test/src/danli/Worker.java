package danli;

public class Worker { 
	//����һ��˽�еĹ��췽������粻��new'
	private Worker () {};
	//����һ�����еľ�̬�ķ���,���ɷ��ʿΣ�ͨ������.����������
	
	public static Worker Boss() {
		return bo;
	}
	//����һ��˽�еľ�̬����newboss��ֻ�ܱ�����ʣ������ʱֻ��ִ��һ��
private static Worker bo=new Worker();
}
