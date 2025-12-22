package yuuine.raginference.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yuuine.raginference.dto.request.InferenceRequest;
import yuuine.raginference.dto.response.InferenceResponse;
import yuuine.raginference.service.InferenceService;

@RestController
@RequestMapping("/inference")
@RequiredArgsConstructor
public class InferenceController {

    private final InferenceService inferenceService;

    @PostMapping("/chat")
    public InferenceResponse chat(@RequestBody InferenceRequest request) {

        return inferenceService.infer(request);

    }
}
