/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2018-03-15 15:52:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web.responsive.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productOrderFormJQueryTemplates_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.release();
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("<script id=\"future-stock-template\" type=\"text/x-jquery-tmpl\">\n");
      out.write("\t<span class=\"future_stock\">\n");
      out.write("\t\t<span class=\"future_stock_table\">\n");
      out.write("\t\t\t{{each(index, availability) availabilities}}\n");
      out.write("\t\t\t<div class=\"future_stock_value\">\n");
      out.write("                <div>${formattedDate}</div>\n");
      out.write("\t\t\t    <div>${stock.stockLevel}</div>\n");
      out.write("            </div>\n");
      out.write("\t\t\t{{/each}}\n");
      out.write("\t\t</span>\n");
      out.write("\t</span>\n");
      out.write("</script>\n");
      out.write("<script id=\"future-tooltip-error-template\" type=\"text/x-jquery-tmpl\">\n");
      out.write("\t<span class='oms_message_holder' id='oms-message-holder'>$\\{errorMessage}</span>\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script id=\"variant-summary\" type=\"text/x-jquery-tmpl\">\n");
      out.write("    <tr class=\"variant-summary hidden-sm hidden-md hidden-lg\">\n");
      out.write("        <td colspan=\"2\">\n");
      out.write("            <table class=\"variant-summary-items\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"variant-property\"></td>\n");
      out.write("                    <td>");
      if (_jspx_meth_spring_005ftheme_005f0(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("                    <td>");
      if (_jspx_meth_spring_005ftheme_005f1(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                {{each(index, availability) variants}}\n");
      out.write("                    <tr>\n");
      out.write("                        <td>${size}</td>\n");
      out.write("                        <td>${quantity}</td>\n");
      out.write("                        <td>${total}</td>\n");
      out.write("                    </tr>\n");
      out.write("                {{/each}}\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</script>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_spring_005ftheme_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f0 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f0_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/responsive/product/productOrderFormJQueryTemplates.tag(26,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f0.setCode("product.grid.quantityText");
      int[] _jspx_push_body_count_spring_005ftheme_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f0 = _jspx_th_spring_005ftheme_005f0.doStartTag();
        if (_jspx_th_spring_005ftheme_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f0);
      _jspx_th_spring_005ftheme_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005ftheme_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:theme
    org.springframework.web.servlet.tags.ThemeTag _jspx_th_spring_005ftheme_005f1 = (org.springframework.web.servlet.tags.ThemeTag) _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.get(org.springframework.web.servlet.tags.ThemeTag.class);
    boolean _jspx_th_spring_005ftheme_005f1_reused = false;
    try {
      _jspx_th_spring_005ftheme_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005ftheme_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/responsive/product/productOrderFormJQueryTemplates.tag(27,24) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005ftheme_005f1.setCode("product.grid.subtotalText");
      int[] _jspx_push_body_count_spring_005ftheme_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005ftheme_005f1 = _jspx_th_spring_005ftheme_005f1.doStartTag();
        if (_jspx_th_spring_005ftheme_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005ftheme_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005ftheme_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005ftheme_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005ftheme_0026_005fcode_005fnobody.reuse(_jspx_th_spring_005ftheme_005f1);
      _jspx_th_spring_005ftheme_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005ftheme_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005ftheme_005f1_reused);
    }
    return false;
  }
}
