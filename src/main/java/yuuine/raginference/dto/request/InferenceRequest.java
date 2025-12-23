package yuuine.raginference.dto.request;

import lombok.Data;


@Data
public class InferenceRequest {

    private String query;

    private Integer topK;

}