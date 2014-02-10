package be.nmine.service;

public class RestService {

    // @Produces(MediaType.TEXT_PLAIN)
    // @Consumes(MediaType.MULTIPART_FORM_DATA)
    // @Path("{id}/validateCertificate")
    // @POST
    // public String requestC2ScertificateValidation(@PathParam("id") Integer depositId, @FormDataParam("certificateValue") String certificateValue,
    // @FormDataParam("intermediateCACertificateValue") List<FormDataBodyPart> intermediateCACertificateValueBodyParts, @FormDataParam("parametersMapJSON") String parametersMapJSON)
    // throws IOException {
    //
    // LOG.debug("Received certificate validation request: [certificateValue={}], [intermediateCACertificateValue={}], [parametersMapJSON={}]", certificateValue,
    // intermediateCACertificateValueBodyParts, parametersMapJSON);
    //
    // return "certificate.validation.successful";
    // }
    //
    // @Produces(MediaType.TEXT_PLAIN)
    // @Consumes(MediaType.MULTIPART_FORM_DATA)
    // @Path("{id}/signature")
    // @POST
    // public String addDepositSignature(@PathParam("id") Integer depositId, @FormDataParam("signatureValue") byte[] signatureValue,
    // @FormDataParam("signatureCertificateBase64") String signatureCertificateBase64, @FormDataParam("parametersMapJSON") String parametersMapJSON) throws IOException {
    // LOG.debug("Received signature: [signatureValue.length={}], [signatureCertificate={}], [parametersMapJSON={}]", signatureValue.length, signatureCertificateBase64, parametersMapJSON);
    //
    // signatureAppletHandler.createExpedition(depositId, signatureValue);
    //
    // return "signature.post.successful";
    // }
    //
    // @Produces(MediaType.APPLICATION_OCTET_STREAM)
    // @Path("{id}/deedToSign")
    // @GET
    // public Response getDeedToSign(@PathParam("id") Integer depositId, @Context HttpServletResponse response) {
    // LOG.debug("Received getDeedToSign request: [depositId={}]", depositId);
    // try {
    // ResponseBuilder responseBuilder = Response.ok();
    // response.setHeader("Content-Disposition", "inline; filename=deedToSign");
    //
    // InputStream is = signatureAppletHandler.getDeedToSign(depositId);
    // // OutputStream os = response.getOutputStream();
    // ByteArrayOutputStream os = new ByteArrayOutputStream();
    // byte[] ba = new byte[4096];
    // for (int r = 0; (r = is.read(ba)) > -1;)
    // os.write(ba, 0, r);
    //
    // byte[] result = os.toByteArray();
    // response.setHeader("content-length", String.valueOf(result.length));
    //
    // response.getOutputStream().write(result);
    //
    // return responseBuilder.build();
    // } catch (IOException e) {
    // return Response.status(Status.INTERNAL_SERVER_ERROR).build();
    // }
    // }
    //
    // @GET
    // @Path("/ping")
    // public String ping() {
    // return "Hello World";
    // }

}
