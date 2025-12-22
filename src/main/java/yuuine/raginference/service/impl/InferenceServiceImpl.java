package yuuine.raginference.service.impl;

import org.springframework.stereotype.Service;
import yuuine.raginference.dto.request.InferenceRequest;
import yuuine.raginference.dto.response.InferenceResponse;
import yuuine.raginference.service.InferenceService;

@Service
public class InferenceServiceImpl implements InferenceService {
    @Override
    public InferenceResponse infer(InferenceRequest request) {
        return null;
    }
}
