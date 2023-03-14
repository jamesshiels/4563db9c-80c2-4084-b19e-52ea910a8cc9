package com.example.demo;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class ModelController {
    @RestController
    @RequestMapping("/values")
    public class UserController {
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
        public void add(@RequestBody @NotNull Model model) {
            modelService.saveModel(model);
        }

        // @NotNull input validation
        @PutMapping("/{id}")
        public ResponseEntity<?> update(@RequestBody @NotNull Model model, @PathVariable Integer id) {
            try {
                Model existModel = modelService.getModel(id);
                model.setId(id);
                modelService.saveModel(model);
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (NoSuchElementException e) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable @NotNull Integer id) {

            modelService.deleteModel(id);
        }
    }
}
