package com.pagetechsys.springairag.services;

import com.pagetechsys.springairag.model.*;

public interface OpenAIService {
    Answer getAnswer(Question question);
}
