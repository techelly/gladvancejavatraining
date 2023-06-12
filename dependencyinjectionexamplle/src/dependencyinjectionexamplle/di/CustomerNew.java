package dependencyinjectionexamplle.di;
//Interface based dependency injection
public class CustomerNew implements IAddressInjector{
		private IAddress iAddress;

		@Override
		public void injectAddress(IAddress address) {
			this.iAddress=address;
			
		}
		
		
}
