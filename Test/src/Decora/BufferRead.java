package Decora;

public class BufferRead extends Read{
	//Ҫ��װ��FileRead,�϶�Ҫ�����˼�
	Read read;
	//����һ������read�Ĺ��췽��,��FileRead���������ٸ���
	//��Ա����read
	public BufferRead(Read read) {
		this.read=read;
	}
	//��д���˼�һ���ķ����ſ���װ��
	public  void Mook() {
		
		System.out.println("buffer1");
		read.Mook();
		System.out.println("buffer2");
	}

}
