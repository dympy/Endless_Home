package com.dympy.unify.ui.menu;

import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;

/**
 * Action item, displayed as menu with icon and text.
 *
 * @author Lorensius. W. L. T <lorenz@londatiga.net>
 *         <p/>
 *         Contributors:
 *         - Kevin Peck <kevinwpeck@gmail.com>
 *         <p/>
 *         Person who f*cked everything so it would be like he wanted it:
 *         - Dymion Fritz <DympyDev@gmail.com></DympyDev@gmail.com>
 */
public class ActionItem {
    private Bitmap thumb;
    private String title;
    private int actionId = -1;
    private boolean selected;
    private boolean sticky;

    /**
     * Constructor
     */
    public ActionItem() {
        this(-1, null);
    }

    /**
     * Constructor
     *
     * @param actionId Action id of the item
     * @param title    Text to show for the item
     */
    public ActionItem(int actionId, String title) {
        this.actionId = actionId;
        this.title = title;
    }

    /**
     * Set action title
     *
     * @param title action title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get action title
     *
     * @return action title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set action id
     *
     * @param actionId Action id for this action
     */
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    /**
     * @return Our action id
     */
    public int getActionId() {
        return actionId;
    }

    /**
     * Set sticky status of button
     *
     * @param sticky true for sticky, pop up sends event but does not disappear
     */
    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    /**
     * @return true if button is sticky, menu stays visible after press
     */
    public boolean isSticky() {
        return sticky;
    }

    /**
     * Set selected flag;
     *
     * @param selected Flag to indicate the item is selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * Check if item is selected
     *
     * @return true or false
     */
    public boolean isSelected() {
        return this.selected;
    }

    /**
     * Set thumb
     *
     * @param thumb Thumb image
     */
    public void setThumb(Bitmap thumb) {
        this.thumb = thumb;
    }

    /**
     * Get thumb image
     *
     * @return Thumb image
     */
    public Bitmap getThumb() {
        return this.thumb;
    }
}