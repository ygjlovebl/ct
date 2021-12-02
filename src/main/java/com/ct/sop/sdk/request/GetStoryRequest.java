package com.ct.sop.sdk.request;


import com.ct.sop.sdk.response.GetStoryResponse;

public class GetStoryRequest extends BaseRequest<GetStoryResponse> {
    @Override
    protected String method() {
        return "story.get";
    }

}
