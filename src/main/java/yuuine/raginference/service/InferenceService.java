package yuuine.raginference.service;

import yuuine.raginference.dto.request.InferenceRequest;
import yuuine.raginference.dto.response.InferenceResponse;

public interface InferenceService {

    InferenceResponse infer(InferenceRequest request);

}
