<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Page1.page1}" id="page1">
            <ui:html binding="#{Page1.html1}" id="html1">
                <ui:head binding="#{Page1.head1}" id="head1">
                    <ui:link binding="#{Page1.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Page1.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Page1.form1}" id="form1">
                        <ui:listbox binding="#{Page1.listbox1}" id="listbox1" items="#{Page1.listbox1DefaultOptions.options}" style="height: 264px; left: 0px; top: 24px; position: absolute; width: 120px"/>
                        <ui:textField binding="#{Page1.rh1}" id="rh1" style="height: 24px; left: 216px; top: 48px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh1}" id="eh1" style="height: 24px; left: 312px; top: 48px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh2}" id="rh2" style="height: 24px; left: 216px; top: 72px; position: absolute; width: 74px"/>
                        <ui:textField binding="#{Page1.eh2}" id="eh2" style="height: 24px; left: 312px; top: 72px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh3}" id="rh3" style="height: 24px; left: 216px; top: 96px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh3}" id="eh3" style="height: 24px; left: 312px; top: 96px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh4}" id="rh4" style="height: 24px; left: 216px; top: 120px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh4}" id="eh4" style="height: 24px; left: 312px; top: 120px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh5}" id="rh5" style="height: 24px; left: 216px; top: 144px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh5}" id="eh5" style="height: 24px; left: 312px; top: 144px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh6}" id="rh6" style="height: 24px; left: 216px; top: 168px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh6}" id="eh6" style="height: 24px; left: 312px; top: 168px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh7}" id="rh7" style="height: 24px; left: 216px; top: 192px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh7}" id="eh7" style="height: 24px; left: 312px; top: 192px; position: absolute; width: 72px" valueChangeListener="#{Page1.eh7_processValueChange}"/>
                        <ui:textField binding="#{Page1.rh8}" id="rh8" style="height: 24px; left: 216px; top: 216px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh8}" id="eh8" style="height: 24px; left: 312px; top: 216px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh9}" id="rh9" style="height: 24px; left: 216px; top: 240px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh9}" id="eh9" style="height: 24px; left: 312px; top: 240px; position: absolute; width: 72px" valueChangeListener="#{Page1.eh9_processValueChange}"/>
                        <ui:textField binding="#{Page1.rh10}" id="rh10" style="height: 24px; left: 216px; top: 264px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh10}" id="eh10" style="height: 24px; left: 312px; top: 264px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh11}" id="rh11" style="height: 24px; left: 216px; top: 288px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh11}" id="eh11" style="height: 24px; left: 312px; top: 288px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh12}" id="rh12" style="height: 24px; left: 216px; top: 312px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh12}" id="eh12" style="height: 24px; left: 312px; top: 312px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh13}" id="rh13" style="height: 24px; left: 216px; top: 336px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh13}" id="eh13" style="height: 24px; left: 312px; top: 336px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh14}" id="rh14" style="height: 24px; left: 216px; top: 360px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh14}" id="eh14" style="height: 24px; left: 312px; top: 360px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.rh15}" id="rh15" style="height: 24px; left: 216px; top: 384px; position: absolute; width: 72px"/>
                        <ui:textField binding="#{Page1.eh15}" id="eh15" style="height: 24px; left: 312px; top: 384px; position: absolute; width: 72px"/>
                        <ui:label binding="#{Page1.label1}" id="label1" style="left: 216px; top: 24px; position: absolute" text="Regular"/>
                        <ui:label binding="#{Page1.label2}" id="label2" style="left: 312px; top: 24px; position: absolute" text="Overtime"/>
                        <ui:label binding="#{Page1.label3}" id="label3" style="left: 144px; top: 24px; position: absolute" text="Days"/>
                        <ui:label binding="#{Page1.label4}" id="label4" style="left: 144px; top: 48px; position: absolute" text="1"/>
                        <ui:label binding="#{Page1.label5}" id="label5" style="left: 144px; top: 72px; position: absolute" text="2"/>
                        <ui:label binding="#{Page1.label6}" id="label6" style="left: 144px; top: 96px; position: absolute" text="3"/>
                        <ui:label binding="#{Page1.label7}" id="label7" style="left: 144px; top: 120px; position: absolute" text="4"/>
                        <ui:label binding="#{Page1.label8}" id="label8" style="left: 144px; top: 144px; position: absolute" text="5"/>
                        <ui:label binding="#{Page1.label9}" id="label9" style="left: 144px; top: 168px; position: absolute" text="6"/>
                        <ui:label binding="#{Page1.label10}" id="label10" style="left: 144px; top: 192px; position: absolute" text="7"/>
                        <ui:label binding="#{Page1.label11}" id="label11" style="left: 144px; top: 216px; position: absolute" text="8"/>
                        <ui:label binding="#{Page1.label12}" id="label12" style="height: 24px; left: 144px; top: 240px; position: absolute" text="9"/>
                        <ui:label binding="#{Page1.label13}" id="label13" style="left: 144px; top: 264px; position: absolute" text="10"/>
                        <ui:label binding="#{Page1.label14}" id="label14" style="left: 144px; top: 288px; position: absolute" text="11"/>
                        <ui:label binding="#{Page1.label15}" id="label15" style="left: 144px; top: 312px; position: absolute" text="12"/>
                        <ui:label binding="#{Page1.label16}" id="label16" style="left: 144px; top: 336px; position: absolute" text="13"/>
                        <ui:label binding="#{Page1.label17}" id="label17" style="height: 24px; left: 144px; top: 360px; position: absolute" text="14"/>
                        <ui:label binding="#{Page1.label18}" id="label18" style="left: 144px; top: 384px; position: absolute" text="15"/>
                        <ui:label binding="#{Page1.label19}" id="label19" style="position: absolute; left: 408px; top: 48px" text="status"/>
                        <ui:textField binding="#{Page1.textField31}" id="textField31" style="height: 24px; left: 480px; top: 48px; position: absolute; width: 144px"/>
                        <ui:label binding="#{Page1.label20}" id="label20" style="position: absolute; left: 408px; top: 96px" text="payed"/>
                        <ui:textField binding="#{Page1.textField32}" id="textField32" style="height: 24px; left: 480px; top: 96px; position: absolute; width: 144px"/>
                        <ui:label binding="#{Page1.label21}" id="label21" style="position: absolute; left: 408px; top: 144px" text="comment"/>
                        <ui:textField binding="#{Page1.textField33}" id="textField33" style="height: 24px; left: 480px; top: 144px; position: absolute; width: 144px"/>
                        <ui:button binding="#{Page1.button1}" id="button1" style="left: 215px; top: 432px; position: absolute" text="save"/>
                        <ui:button binding="#{Page1.button2}" id="button2" style="left: 311px; top: 432px; position: absolute" text="Delete"/>
                        <ui:label binding="#{Page1.label22}" id="label22" style="height: 24px; left: 192px; top: 0px; position: absolute; width: 238px" text="Regular time +overtime&lt;=16"/>
                        <ui:button binding="#{Page1.button3}" id="button3" style="position: absolute; left: 480px; top: 216px" text="New"/>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
