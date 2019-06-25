package com.App.Batch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("batchService")
public class BatchService {
	@Autowired
	private BatchRepository batchRepository;
	
	
	public List<Batch> listAllBatches() {
		
		return batchRepository.findAll();
	}
	
	public Batch findById(Integer id) {
		return batchRepository.findById(id).get();
	}
	
	
	
	
	
}


