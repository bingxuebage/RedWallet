package wallet.mysiga.com.redwallet.view;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;

/**
 * 服务接口
 *
 * @author Wlison milin411@163.com
 */
public interface IWalletServiceView {
    AccessibilityService getAccessibilityService();
    Context getContext();
}
