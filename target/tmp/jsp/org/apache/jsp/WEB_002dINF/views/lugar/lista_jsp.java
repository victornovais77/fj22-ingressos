/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.0.v20161208
 * Generated at: 2018-07-07 18:55:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.lugar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/home/lab7815/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("jar:file:/home/lab7815/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1482324802000L));
    _jspx_dependants.put("jar:file:/home/lab7815/.m2/repository/org/springframework/security/spring-security-taglibs/4.2.1.RELEASE/spring-security-taglibs-4.2.1.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1482347444000L));
    _jspx_dependants.put("file:/home/lab7815/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1529781083000L));
    _jspx_dependants.put("file:/home/lab7815/.m2/repository/org/springframework/security/spring-security-taglibs/4.2.1.RELEASE/spring-security-taglibs-4.2.1.RELEASE.jar", Long.valueOf(1529781082000L));
    _jspx_dependants.put("/WEB-INF/tags/template.tag", Long.valueOf(1530977182000L));
    _jspx_dependants.put("file:/home/lab7815/.m2/repository/org/springframework/spring-webmvc/4.3.5.RELEASE/spring-webmvc-4.3.5.RELEASE.jar", Long.valueOf(1529781080000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_ingresso_005ftemplate_005f0(_jspx_page_context))
        return;
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ingresso_005ftemplate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ingresso:template
    org.apache.jsp.tag.web.template_tag _jspx_th_ingresso_005ftemplate_005f0 = (new org.apache.jsp.tag.web.template_tag());
    _jsp_getInstanceManager().newInstance(_jspx_th_ingresso_005ftemplate_005f0);
    _jspx_th_ingresso_005ftemplate_005f0.setJspContext(_jspx_page_context);
    _jspx_th_ingresso_005ftemplate_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_ingresso_005ftemplate_005f0, null));
    _jspx_th_ingresso_005ftemplate_005f0.doTag();
    _jsp_getInstanceManager().destroyInstance(_jspx_th_ingresso_005ftemplate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/views/lugar/lista.jsp(14,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("map");
      // /WEB-INF/views/lugar/lista.jsp(14,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/lugar/lista.jsp(14,4) '${sala.mapaDeLugares}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${sala.mapaDeLugares}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t<tr class=\"fileira\">\n");
            out.write("\t\t\t\t\t\t<td class=\"fileira-valor\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${map.key}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("\t\t\t\t\t\t<td class=\"fileira-assentos\">\n");
            out.write("\t\t\t\t\t\t<table>\n");
            out.write("\t\t\t\t\t\t\t<tr>\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\n");
            out.write("\t\t\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t\t\t</table>\n");
            out.write("\t\t\t\t\t</tr>\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/lugar/lista.jsp(20,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("lugar");
      // /WEB-INF/views/lugar/lista.jsp(20,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/lugar/lista.jsp(20,7) '${map.value}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${map.value}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t\t\t\t<td class=\"fileira-assento\"><figure>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<svg class=\"assento\" version=\"1.0\" id=\"SEAT\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\"\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t viewBox=\"0 0 318.224 305.246\" enable-background=\"new 0 0 318.224 305.246\" xml:space=\"preserve\" width=\"20\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<g id=\"FILL\">\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<path d=\"M269.395,132.246h-15.02V51.414c0-11.758-9.492-21.248-21.248-21.248H85.097\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tc-11.757,0-21.248,9.49-21.248,21.248v80.833H48.827c-8.535,0-15.127,7.505-14.024,15.971l11.406,87.625\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tc0.462,3.538,3.476,6.187,7.045,6.187h17.958l4.629,21.843c1.385,6.536,7.155,11.209,13.833,11.209h138.845\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tc6.68,0,12.448-4.672,13.833-11.209l4.648-21.933l0.009,0.09h17.959c3.569,0,6.585-2.649,7.045-6.187l11.407-87.625\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tC284.522,139.751,277.931,132.246,269.395,132.246z\"/>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</g>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<path id=\"STROKE\" fill=\"#4F4F4F\" d=\"M290.664,127.709c-5.374-6.118-13.126-9.628-21.269-9.628h-0.854V51.414\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc0-19.526-15.886-35.414-35.414-35.414H85.097c-19.528,0-35.414,15.888-35.414,35.414v66.667h-0.856\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc-8.144,0-15.896,3.51-21.271,9.628c-5.374,6.121-7.852,14.262-6.799,22.338l11.406,87.625\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc1.378,10.562,10.444,18.523,21.091,18.523h6.479l2.25,10.614c2.755,13,14.401,22.438,27.691,22.438h138.845\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc13.291,0,24.937-9.438,27.691-22.438l2.25-10.614h6.509c10.652,0,19.72-7.965,21.093-18.527l11.406-87.621\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tC298.518,141.968,296.039,133.827,290.664,127.709z M266.746,235.147c-0.111,0.899-0.878,1.57-1.778,1.57h-11.43l2.404-11.337\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc1.224-5.769-0.208-11.703-3.922-16.289c-0.737-0.91-1.594-1.681-2.462-2.428V139.35c0-0.989,0.802-1.791,1.791-1.791h18.046\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc2.58,0,4.932,1.065,6.633,3.002c1.702,1.937,2.455,4.413,2.123,6.972L266.746,235.147z M66.873,137.558\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc0.989,0,1.791,0.802,1.791,1.791v67.286c-0.878,0.754-1.745,1.536-2.49,2.455c-3.714,4.586-5.146,10.52-3.922,16.289l2.404,11.337\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tH53.254c-0.899,0-1.66-0.671-1.771-1.563l-11.413-87.621c-0.332-2.559,0.422-5.035,2.123-6.972s4.053-3.002,6.633-3.002H66.873z\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t M249.088,127.162c-5.767,1.069-10.154,6.114-10.154,12.187v62.766c-0.674-0.069-1.331-0.225-2.02-0.225H81.281\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc-0.678,0-1.326,0.152-1.992,0.221V139.35c0-6.056-4.361-11.094-10.105-12.18V51.431c0-8.784,7.152-15.936,15.936-15.936h148.032\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc8.784,0,15.936,7.152,15.936,15.936V127.162z M81.039,262.772l-8.397-39.591c-0.553-2.621,0.097-5.319,1.785-7.394\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\tc1.681-2.082,4.185-3.272,6.854-3.272h155.634c2.67,0,5.174,1.19,6.854,3.272c1.688,2.075,2.338,4.773,1.785,7.394l-8.397,39.591\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\tc-0.858,4.053-4.496,7-8.639,7H89.678C85.534,269.772,81.896,266.825,81.039,262.772z\"/>\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</svg>\n");
            out.write("\t\t\t\t\t\t\t\t    <figcaption>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lugar.posicao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</figcaption>\n");
            out.write("\t\t\t\t\t\t\t\t</figure></td>\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("\t\t<div class=\" col-md-6 col-md-offset-3\">\n");
      out.write("\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sala.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\t\t<table class=\"table-compra\" id=\"lugares\">\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t<div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("\t\t\t<a href=\"/admin/lugar?salaId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sala.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-block btn-info\">Novo</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
