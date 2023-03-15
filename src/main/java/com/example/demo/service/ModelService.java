package com.example.demo.service;

import com.example.demo.repository.ModelRepository;
import com.example.demo.model.Model;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;
    public List<Model> listAllModels(){
        return modelRepository.findAll();
    }
    public  void saveModel(Model model){
        modelRepository.save(model);
    }
    public Model getModel(Integer id){
        return modelRepository.findById(id).get();
    }
    public void deleteModel(Integer id){
        modelRepository.deleteById(id);
    }
}
