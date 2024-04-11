package gioelefriggiau5d8hw.payloads;

import lombok.Getter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class NewBlogPostPayload {
    @NotNull
    private int authorId;

    @NotBlank
    private String category;

    @NotBlank
    private String content;

    @NotNull
    private double readingTime;

    @NotBlank
    @Size(max = 100)
    private String title;
}
