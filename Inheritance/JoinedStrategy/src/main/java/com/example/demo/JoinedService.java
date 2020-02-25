package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinedService {

	@Autowired
	private JAuthorRepository authorRepo;
	
	@Autowired
	private JBookRepo bookRepo;
	
	@Autowired
	private JBlogPostRepo blogPostRepo;
	
	@Autowired
	private JPublicationRepo pubRepo;
	
	public void savePub() {
		
		JBook b1 = new JBook("HFN", 1, new Date(), 230 );
		JBook b2 = new JBook("DD", 2, new Date(), 235 );
		
		JBlogPost bp1 = new JBlogPost( "HFN BP", 1, new Date(),"hfn.com" );
		JBlogPost bp2 = new JBlogPost("SMSF BP", 1, new Date(), "smsf.com" );
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		
		blogPostRepo.save(bp1);
		blogPostRepo.save(bp2);

		List<JPublication> pbs = pubRepo.findAll();
		
		for(JPublication pb : pbs) {
			if(pb instanceof JBook) {
				System.out.println("Book ##" + pb);
			}
			else if(pb instanceof JBlogPost) {
				System.out.println("JBlogPostt ##" + pb);
			}
		}
		//saveAuthor();
	}
	
	public void saveAuthor() {
		List<JAuthor> authors = authorRepo.findAll();
		
		List<JPublication> pbs = pubRepo.findAll();
		for(JPublication pb : pbs) {
			pb.setAuthors(authors);
			pubRepo.save(pb);
		}
		
		
	}
}