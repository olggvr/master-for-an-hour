package org.example.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateTaskDTO {

    @NotBlank(message = "Идентификатор услуги не может быть пустым")
    private Long id;

    private String name;

    private String categoryName;
}
