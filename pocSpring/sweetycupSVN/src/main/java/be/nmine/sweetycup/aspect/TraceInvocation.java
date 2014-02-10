//package be.nmine.sweetycup.aspect;
//import org.aspectj.lang.JoinPoint;
//
//public class TraceInvocation {
//  public void afficherDebutTrace(final JoinPoint jointPoint) throws Throwable {
//    final Object[] args = jointPoint.getArgs();
//    final StringBuffer sb = new StringBuffer();
//    sb.append(jointPoint.getSignature().toString());
//    sb.append(" avec les parametres : (");
//
//    for (int i = 0; i < args.length; i++) {
//      sb.append(args[i]);
//      if (i < args.length - 1) {
//        sb.append(", ");
//      }
//    }
//    sb.append(")");
//
//  }
//}
