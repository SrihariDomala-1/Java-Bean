//java bean class is EXTENDED version of a POJO CLASS and also implemented by SERIALIZABLE interface
package javaBean;

import java.io.Serializable;

public class DoctorDataJBean01 implements Serializable
{
	private  int docId;
	private String docName;
	private String docSpcl;
	
	public  void DoctorDataJBean01()
	{
		
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocSpcl() {
		return docSpcl;
	}

	public void setDocSpcl(String docSpcl) {
		this.docSpcl = docSpcl;
	}
	
	

}
