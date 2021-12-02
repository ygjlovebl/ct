package com.ct.sop.sdk.request;


import com.ct.sop.sdk.response.DemoFileUploadResponse;

/**
 * @author tanghc
 */
public class DemoFileUploadRequest extends BaseRequest<DemoFileUploadResponse> {
    @Override
    protected String method() {
        return "file.upload";
    }
}
