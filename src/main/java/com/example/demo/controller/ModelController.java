package com.example.demo.controller;

import com.example.demo.model.Model;
import com.example.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

    @RestController
    @RequestMapping("/models")
    public class ModelController {
        @Autowired
        ModelService modelService;

        @GetMapping("")
        public List<Model> list() {
            return modelService.listAllModels();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Model> get(@PathVariable Integer id) {
            try {
                Model model = modelService.getModel(id);
                return new ResponseEntity<Model>(model, HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<Model>(HttpStatus.NOT_FOUND);
            }
        }

        @PostMapping("/")
        public void add(@RequestBody Model model) {
            modelService.saveModel(model);
        }

        // @NotNull input validation
        @PutMapping("/{id}")
        public ResponseEntity<?> update(@RequestBody Model model, @PathVariable Integer id) {
            try {
                model.setId(id);
                modelService.saveModel(model);
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Integer id) {

            modelService.deleteModel(id);
        }
    }
