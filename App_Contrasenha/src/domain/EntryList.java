package domain;

import java.io.Serializable;
import java.util.List;

public class EntryList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9091591604027561290L;
	private String title;
	private int idList;
	
	public int getIdList() {
		return idList;
	}
	public void setIdList(int idList) {
		this.idList = idList;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Entry> getEntryList() {
		return entryList;
	}
	public void setEntryList(List<Entry> entryList) {
		this.entryList = entryList;
	}
	private  List<Entry> entryList;

	@Override
	public String toString() {
		return "EntryList [title=" + title + ", idList=" + idList + ", entryList=" + entryList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entryList == null) ? 0 : entryList.hashCode());
		result = prime * result + idList;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntryList other = (EntryList) obj;
		if (entryList == null) {
			if (other.entryList != null)
				return false;
		} else if (!entryList.equals(other.entryList))
			return false;
		if (idList != other.idList)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	
}

