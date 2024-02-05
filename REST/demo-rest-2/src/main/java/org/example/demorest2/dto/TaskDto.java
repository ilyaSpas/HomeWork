package org.example.demorest2.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Null;
import lombok.Data;

@Data
@Schema(description = "Сущность задачи")
public class TaskDto {
    @Schema(description = "Название")
    @NotEmpty(message = "Title should not be empty!")
    private String title;

    @Schema(description = "Описание")
    @NotEmpty(message = "Description should not be empty!")
    private String description;

    @Schema(description = "Статус")
    @Null(message = "Status set automatically!")
    private String status;
}
