package com.itchenyang.library.test;

public class testSave {
	public static void main(String[] args) {
		
		String aaa = "/ggg/   gg/bbbbbb%20aaaaa";
		System.out.println(aaa.replaceAll("%20", " "));
		

//		Library library = LibraryFactory.eINSTANCE.createLibrary();
//		
//		Writer writer = LibraryFactory.eINSTANCE.createWriter();
//		writer.setName("bigkel.chen");
//
//		Book book = LibraryFactory.eINSTANCE.createBook();
//		book.setTitle("cjkcare.top");
//		book.setAuthor(writer);
//
//		library.getWriters().add(writer);
//		library.getBooks().add(book);
//		
//		URI fileURI = URI.createFileURI(new File("E:\\×ÀÃæ\\mylibrary.xml").getAbsolutePath());
//		Resource resource = new XMLResourceImpl(fileURI);
//		resource.getContents().add(library);
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		ResourceSet resourceSet = new ResourceSetImpl();
//		
//		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
//			    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//		URI fileURI = URI.createFileURI(new File("E:\\×ÀÃæ\\mylibrary.xmi").getAbsolutePath());
//		
//		Resource resource = resourceSet.createResource(fileURI);
//
//		resource.getContents().add(library);
//		resource.getContents().add(book);
//		resource.getContents().add(writer);
//
//		try {
//			resource.save(null);
//		} catch (IOException e) {
//		}
	}
}
