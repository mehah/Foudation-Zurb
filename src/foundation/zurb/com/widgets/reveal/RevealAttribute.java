package foundation.zurb.com.widgets.reveal;

public enum RevealAttribute {
	ANIMATION("animation", "fadeAndPop"),
	ANIMATION_SPEED("animation_speed", 250),
	CLOSE_ON_BACKGROUND_CLICK("close_on_background_click", true),
	CLOSE_ON_ESC("close_on_esc", true),
	DISMISS_MODAL_CLASS("dismiss_modal_class", "close-reveal-modal"),
	BG_CLASS("bg_class", "reveal-modal-bg"),
	ROOT_ELEMENT("root_element", "body"),
	BG("bg", null); 
	
	
	public final String realName;
	public final Object defaultValue;
	
	private RevealAttribute(String name, Object value) {
		this.realName = name;
		this.defaultValue = value;
	}
}
