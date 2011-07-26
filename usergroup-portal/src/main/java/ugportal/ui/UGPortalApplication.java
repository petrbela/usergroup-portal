package ugportal.ui;

import ugportal.dao.DaoFactory;
import ugportal.dao.DaoUserGroup;
import ugportal.model.UserGroup;

import com.vaadin.Application;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Form;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.Window;

public class UGPortalApplication extends Application {

	private Table table;

	@Override
	public void init() {
		Window window = new Window("UG Portal");
		setMainWindow(window);

		window.addComponent(new MainWindow());

		window.addComponent(new Label("Hello Portal!"));

		// form for adding a new user group
		final UserGroup userGroup = new UserGroup();
		final Form form = new Form();
		form.setItemDataSource(new BeanItem<UserGroup>(userGroup));
		window.addComponent(form);
		Button add = new Button("Add");
		add.addListener(new ClickListener() {

			@Override
			public void buttonClick(final ClickEvent event) {
				form.commit();
				DaoFactory.getInstance().getDaoUserGroup().put(userGroup);
				table.requestRepaint();
			}
		});
		window.addComponent(add);

		table = new Table("User Groups");
		/*
		 * Define the names and data types of columns. The "default value"
		 * parameter is meaningless here.
		 */
		table.addContainerProperty("Name", String.class, null);

		/* Add a few items in the table. */
		DaoUserGroup dao = DaoFactory.getInstance().getDaoUserGroup();
		for (UserGroup ug : dao.list()) {
			table.addItem(new Object[] { ug.getName() });
		}
		table.addItem(new UserGroup());
		window.addComponent(table);
	}

}
