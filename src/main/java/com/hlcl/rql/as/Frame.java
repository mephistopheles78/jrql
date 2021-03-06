package com.hlcl.rql.as;

public class Frame extends Anchor {

	public Frame(Page page, TemplateElement templateElement, String name, String anchorGuid, boolean isReferenceSource) {
		super(page, templateElement, name, anchorGuid, isReferenceSource);
	}

	public Frame(Page page, TemplateElement frameTemplateElement, RQLNode linkNode) {
		super(page, frameTemplateElement, linkNode);
	}
}
