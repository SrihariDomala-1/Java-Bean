package javaBean;

public class DoctorjBeanMain {

	public static void main(String[] args)
	{
		DoctorDataJBean01 doc=new DoctorDataJBean01();
		doc.setDocId(234);
		doc.setDocName("DR.SAMARAM");
		doc.setDocSpcl(" cardio");
		
		DoctorDataJBean01 doc1=new DoctorDataJBean01();
        doc1.setDocId(211);
		doc1.setDocName("DR.verappan");
		doc1.setDocSpcl(" nervolgist");
		
		DoctorDataJBean01 doc2=new DoctorDataJBean01();
		doc.setDocId(78);
		doc.setDocName("DR.henich");
		doc.setDocSpcl(" gainacologist");
		
		DoctorDataJBean01 doc3=new DoctorDataJBean01();
		doc3.setDocId(234);
		doc3.setDocName("DR.jack");
		doc3.setDocSpcl("pathlogist");

	
		System.out.println(doc3.getDocId() );
	}
	
	

}
