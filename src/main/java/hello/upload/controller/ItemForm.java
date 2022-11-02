package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {

    private Long id;
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}
