package com.dgit.assessment.rule;

import com.dgit.assessment.DgitResponse;

import java.util.List;

public interface BusinessRule {

    DgitResponse countWords(List<String> strings);
}
