package access;
import std.Student0;

public class StudentAchievements2 extends Student0 {
		private String achievement;

		public String getAchievement() {
			return achievement;
		}

		public void setAchievement2(String achievement) {
			this.achievement = achievement;
		}

		public StudentAchievements2(String achievement) {
			this.achievement = achievement;
		}

		public StudentAchievements2() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentAchievements2(int id, String name, float per, String achievement) {
			super(id, name, per);
			this.achievement=achievement;
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			//id=18;// private can't accessible
			//name="Pankaja";// protected accessible within subclass define within another package
			//per=88.80f; // default not accessible within subclass define within another package
			return "StudentAchievements [achievement=" + achievement + ", name=" + name + ", per=" + getPer() + ", id="
					+ getId() + "]";
		}
		
}

