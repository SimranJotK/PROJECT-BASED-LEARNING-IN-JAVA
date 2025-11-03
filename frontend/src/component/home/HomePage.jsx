import React, { useState } from "react";
import RoomResult from "../common/RoomResult";
import RoomSearch from "../common/RoomSearch";




const HomePage = () => {

    const [roomSearchResults, setRoomSearchResults] = useState([]);

    // Function to handle search results
    const handleSearchResult = (results) => {
        setRoomSearchResults(results);
    };

    return (
        <div className="home">
            {/* HEADER / BANNER ROOM SECTION */}
            <section>
                <header className="header-banner">
                    <img src="https://images.unsplash.com/photo-1631049307264-da0ec9d70304?w=1200&h=600&fit=crop" alt="Luxury Hotel Room" className="header-image" />
                    <div className="overlay"></div>
                    <div className="animated-texts overlay-content">
                    <h1>
                            Welcome to <span className="phegon-color">Taj E Lokah</span>
                        </h1><br />
                        <h3>Step into a haven of comfort and care</h3>
                    </div>
                </header>
            </section>

            {/* SEARCH/FIND AVAILABLE ROOM SECTION */}
            <RoomSearch handleSearchResult={handleSearchResult} />
            <RoomResult roomSearchResults={roomSearchResults} />

            <h4><a className="view-rooms-home" href="/rooms">All Rooms</a></h4>

            <h2 className="home-services">Services at <span className="phegon-color">Taj E Lokah</span></h2>

            {/* SERVICES SECTION */}
            <section className="service-section">
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-3iLFQj2bXq0?w=400&h=300&fit=crop" alt="Air Conditioning" />
                    <div className="service-details">
                        <h3 className="service-title">Air Conditioning</h3>
                        <p className="service-description">Stay cool and comfortable throughout your stay with our individually controlled in-room air conditioning.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1558618666-fcd25c85cd64?w=400&h=300&fit=crop" alt="Mini Bar" />
                    <div className="service-details">
                        <h3 className="service-title">Mini Bar</h3>
                        <p className="service-description">Enjoy a convenient selection of beverages and snacks stocked in your room's mini bar with no additional cost.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1558618047-3c8c76ca7d13?w=400&h=300&fit=crop" alt="Parking" />
                    <div className="service-details">
                        <h3 className="service-title">Parking</h3>
                        <p className="service-description">We offer on-site parking for your convenience. Please inquire about valet parking options if available.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1563013544-824ae1b704d3?w=400&h=300&fit=crop" alt="WiFi" />
                    <div className="service-details">
                        <h3 className="service-title">WiFi</h3>
                        <p className="service-description">Stay connected throughout your stay with complimentary high-speed Wi-Fi access available in all guest rooms and public areas.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1571019613454-1cb2f99b2d8b?w=400&h=300&fit=crop" alt="Swimming Pool" />
                    <div className="service-details">
                        <h3 className="service-title">Swimming Pool</h3>
                        <p className="service-description">Relax in our outdoor swimming pool. Pool hours: 6 AM - 10 PM. Book private sessions available.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1571019613454-1cb2f99b2d8b?w=400&h=300&fit=crop" alt="Gym" />
                    <div className="service-details">
                        <h3 className="service-title">Fitness Center</h3>
                        <p className="service-description">Stay fit with our fully equipped gym featuring modern equipment. Open 24/7 with personal trainer services.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1416879595882-3373a0480b5b?w=400&h=300&fit=crop" alt="Botanical Garden" />
                    <div className="service-details">
                        <h3 className="service-title">Botanical Garden</h3>
                        <p className="service-description">Explore our beautiful botanical garden with exotic plants and walking paths. Perfect for relaxation and photography.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1511578314322-379afb476865?w=400&h=300&fit=crop" alt="Events" />
                    <div className="service-details">
                        <h3 className="service-title">Events & Entertainment</h3>
                        <p className="service-description">Host your events with us. From DJ parties to concerts, we provide complete event management services.</p>
                    </div>
                </div>
                <div className="service-card">
                    <img src="https://images.unsplash.com/photo-1566073771259-6a8506099945?w=400&h=300&fit=crop" alt="Travel Services" />
                    <div className="service-details">
                        <h3 className="service-title">Travel Services</h3>
                        <p className="service-description">Book airport transfers, city tours, and transportation services through our concierge desk.</p>
                    </div>
                </div>
            </section>

            {/* CONTACT INFORMATION SECTION */}
            <section className="contact-section">
                <h2>Contact <span className="phegon-color">Taj E Lokah</span></h2>
                <div className="contact-info">
                    <div className="contact-card">
                        <h3>Hotel Information</h3>
                        <p><strong>Address:</strong> 123 Luxury Avenue, Paradise City, PC 12345</p>
                        <p><strong>Phone:</strong> +1 (555) 123-4567</p>
                        <p><strong>Email:</strong> info@tajelokah.com</p>
                        <p><strong>Website:</strong> www.tajelokah.com</p>
                    </div>
                    <div className="contact-card">
                        <h3>Staff Contacts</h3>
                        <p><strong>General Manager:</strong> John Smith - +91 123456789</p>
                        <p><strong>Front Desk:</strong> +91 123456789(24/7)</p>
                        <p><strong>Concierge:</strong> Sarah Johnson - +91 123456789</p>
                        <p><strong>Events Coordinator:</strong> Michael Brown - +91 123456789</p>
                    </div>
                    <div className="contact-card">
                        <h3>Service Hours</h3>
                        <p><strong>Check-in:</strong>24/7</p>
                        <p><strong>Check-out:</strong>24/7</p>
                        <p><strong>Front Desk:</strong> 24/7</p>
                        <p><strong>Room Service:</strong>24/7</p>
                    </div>
                </div>
            </section>
            {/* AVAILABLE ROOMS SECTION */}
            <section>

            </section>
        </div>
    );
}

export default HomePage;
