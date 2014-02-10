package controllers;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;
import utils.ExceptionMailer;

public class CatchAction extends Action<Catch> {
    @Override
    public Result call(Http.Context ctx) {
	try {
	    ctx.session().put("x", "myvalue");
	    return delegate.call(ctx);
	} catch (Throwable e) {
	    if (configuration.send())
		ExceptionMailer.send(e);
	    else
		e.printStackTrace();
	}
	return null;
    }
}